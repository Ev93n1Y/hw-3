public class ATM{
    public int countBanknotes(int sum){
      int result = 0;
      int[] banknotes = new int[]{500,200,100,50,20,10,5,2,1};
      int i = 0;
      while(i<banknotes.length){
          result+=(sum/banknotes[i]);
          sum%=banknotes[i];
          i++;
      }
      return result;
    }
}