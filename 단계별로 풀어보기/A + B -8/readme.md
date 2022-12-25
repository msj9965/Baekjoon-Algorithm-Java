문제 번호 : 11022
BufferedReader와 BufferedWriter을 활용하여 입력, 출력을 진행하였다.
String은 한번 생성한 후 변경할 때 메모리 낭비가 있기 때문에
StringBuffer와 StringBuilder를 고려해보았다.
동기화가 필요없는 환경에서는 StringBuilder가 훨씬 효욜적이라고 한다.
StringBuilder의 append()를 활용해서 문자열에 출력할 것을 삽입하는 방식으로 sb를 구성하였고
마지막에 write로 한번에 출력하였다.
