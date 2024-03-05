import 'dart:async';

Future<int> fetchNumber() {
  return Future.delayed(Duration(seconds: 2), () {
    return 42; 
  });
}

  print('Fetching number...');
 
  int number = await fetchNumber();

  print('Fetched number: $number');
}
