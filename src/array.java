public class array {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0 ; i < score.length;i++) { // score.length 를 사용하면 배열의 길이가 상수로 유동적으로 저장이 되기 때문에 값을 매번 변경해주지 않아도 된다.
            sum += score[i];

        }
        average = sum / (float)score.length;

        System.out.println("총합: " + sum);
        System.out.println("평균: " + average);
    }
}
