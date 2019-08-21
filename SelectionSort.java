public class SelectionSort{
   public static void main(String[] args){
   double[] list = {2.3, 4.3, 2.1, 2.4, 4.6, 10.2};
   selectionSort(list);
   
   for (int i = 0; i < list.length; i++){
      System.out.println(list[i]);
      }
   }
   public static void selectionSort(double[] list){
      for (int i = 0; i < list.length - 1; i++){
      //this will find the minimum value in the list
         double currentMin = list[i];
         int currentMinIndex = i;
         
         for (int j = i + 1; j < list.length; j++){
            if (currentMin > list[j]) {
               currentMin = list[j];
               currentMinIndex = j;
              }
             }
         if (currentMinIndex != i){
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
          }
         }
        }
       }