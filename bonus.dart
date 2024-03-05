import 'dart:async';
import 'dart:io';
import 'package:http/http.dart' as http;

Future<void> downloadFile(String url, String savePath) async {
  final response = await http.get(Uri.parse(url));
  final file = File(savePath);

  await file.writeAsBytes(response.bodyBytes);
}

Future<void> main() async {
  final List<String> urls = [
    'https://example.com/file1.pdf',
    'https://example.com/file2.pdf',
    'https://example.com/file3.pdf'
  ];

  final savePaths = ['file1.pdf', 'file2.pdf', 'file3.pdf'];

  final List<Future<void>> downloadFutures = [];

  for (var i = 0; i < urls.length; i++) {
    final url = urls[i];
    final savePath = savePaths[i];
    downloadFutures.add(downloadFile(url, savePath));
  }

  await Future.wait(downloadFutures)
      .then((_) => print('All files downloaded successfully!'))
      .catchError((error) => print('Error downloading files: $error'));
}
