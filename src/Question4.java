public class Question4 {
    public static void main(String[] args) {
        int[]array ={3,7,2,9,4};
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];

            }
        }
       System.out.println("최대값은"+max+"입니다");
    }
}
