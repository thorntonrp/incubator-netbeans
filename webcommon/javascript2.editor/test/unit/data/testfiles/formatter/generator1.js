function*    idMaker()  {
  var   index = 0;
          while(index < 3)
    yield index++;
}

var gen = idMaker();

function* anotherGenerator(i) {
  yield i + 1;
  yield i + 2;
  yield i + 3;
}