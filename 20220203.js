// Recursion
// 자기 자신을 호출하는 함수
/*
public class code01 {
    public static void main(String[] args){
        func();
    }

    public static void func(){
        System.out.println("Hello...");
        func();
    }
}
*/

// 위와 같은 상황일 경우엔 무한 루프에 빠지게 됨

/*
public class code02 {
    public static void main(String[] args){
        int n = 4;
        func(n);
    }

    public static void func(int k){
        if ( k <= 0){
            return;
        }else {
            System.out.println("Hello...");
            func(k-1);
        }
    }
}
*/

// 순환함수와 수학적 귀납법
// Factorial : n!
// 팩토리얼 함수
/*
 0! = 1
 n! = n X (n-1)! n>0
 */

/*
  public static int factorial(int n){
        if ( n == 0){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
 */

// 피보나치 넘버
// 피보나치 수열이란 첫째 항, 둘째 항이 1이고 그 뒤의 항은 바로 앞의 두 항의 합인 수열을 뜻
/*
  public static int fibonacci(int n){
        if ( n < 2){
            return n;
        }else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
 */

// 최대공약수
/*
public static double gcd (int m, int n){
    if ( m < n){
        int tmp = m;
        m = n;
        n = tmp;
    }
    if ( m % n){
        return n;
    }else {
        return gcd(n, m%n);
    }
}

*/

// Recursive Thinking 순환적으로 사고하기

/* 문자열의 길이 계산
public static int lenght(String str){
    if ( str.equals("")){
        return 0;
    }else{
        return 1+length(str.substring(1)); 첫 글자를 제외한 길이에 +1 을 해주는 것
    }
}
*/

/* 문자열의 프린트
public static void printChars(String str){
    
    if ( str.length() == 0){
        return;
    }else {
        str.charAt(0);              // charAt(0) : 문자열의 첫 글자를 반환시켜주는 것
        print(str.substring(1));    // 문자열를 제외한 나머지 글자를 출력
    }
}
*/

/* 문자열을 뒤집어 프린트
public static void printCharsReverse(String str){
    
    if ( str.length() == 0){
        return;
    }else {
        printCharsReverse(str.substring(1));
        print(str.charAt(0));
    }
}
*/

/* 2진수로 변환하여 출력
public static void printIntBinary(int n){
    
    if ( n<2){

    }else{
        printIntBinary(n/2);
        System.out.print(n%2);  
    }
}
*/

/* 배열의 합 구하기 
data[0]에서 data[n-1]까지의 합을 구하여 반환한다.
public static int sum(int n, int[] data){
    
    if ( n<=0){
        return 0;
    }else{
       return sum(n-1,data) + data[n-1];
    }
}

*/

/* Recursion vs Iteration 

- 모든 순환함수는 반복문(iteration)으로 변경 가능
- 그 역도 성립함. 즉, 모든 반복문은 recursion으로 표현 가능
- 순환함수는 복잡한 알고리즘을 단순하고 알기쉽게 표현하는 것을 가능하게 함
- 하지만 함수 호출에 따른 오버헤드가 있음 (매개변수 전달, 액티베이션 프레임 생성 등)
*/

/* Designing Recursion 순환 알고리즘의 설계 

- 적어도 하나의 base case, 즉 순환되지 않고 종료되는 case가 있어야 함
- 모든 case는 결국 base case로 수렴해야 함
- 암시적(implicit) 매개변수를 명시적(explicit) 매개변수로 바꾸어라

*/

/* 순차 탐색 
매개변수의 명시화  (재귀함수 식으로 표현)
1) 앞에서부터
int search(int [] data, int begin, int end, int target){
    if ( begin>end){
        return -1;
    }else if ( target == begin){
        return begin;
    }else {
        return search(data, begin+1, end, target);
    }
}

2) 뒤에서부터
int search(int [] data, int begin, int end, int target){
    if ( begin>end){
        return -1;
    }else if ( target == end){
        return end;
    }else {
        return search(data, begin, end-1, target);
    }
}

3) 중간에서부터
int search(int [] data, int begin, int end, int target){
    if ( begin>end){
        return -1;
    }else {
        int middle = (begin+end) /2;
        if (data[middle] == target) {
            return middle;
        }
        int index = search(data, begin, middle-1, target);
        if( index != -1){
            return index;
        }else {
            return search(data, middle+1, end, target)
        }
    }
}




*/
