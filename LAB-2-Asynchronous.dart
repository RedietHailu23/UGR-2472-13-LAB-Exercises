import 'dart:async';

Future<int> fetchNumber() {
  return Future.delayed(Duration(seconds: 2), () {
    return 42;
  });
}

void main() {
  print('Fetching number...');
 
  fetchNumber().then((number) {
  
    print('Fetched number: $number');
  });
}
