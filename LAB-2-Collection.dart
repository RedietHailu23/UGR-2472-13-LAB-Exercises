void printMapKeysAndValues(Map<dynamic, dynamic> map) {
  map.forEach((key, value) {
    print('Key: $key, Value: $value');
  });
}

void main() {
  
  Map<String, int> exampleMap = {
    'apple': 10,
    'banana': 20,
    'orange': 15,
    'grape': 25,
  };
  printMapKeysAndValues(exampleMap);
}
