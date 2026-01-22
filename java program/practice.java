public class practice{
            public static int search(int[] arr,int targert){
                for(int i=0;i<arr.length;i++){
                    if(arr[i]==targert){
                        return i;
                    }
                }
                return -1;
        }
        public static void main(String[] args){
            int[] number={10,20,30,40};
            int targert=0;
            int result=search(number,targert);
            if(result!=-1){
                System.out.println(result);
            }else{
                System.out.println("not found");
            }

        }       }    
     