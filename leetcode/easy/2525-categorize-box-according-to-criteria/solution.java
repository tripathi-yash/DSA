class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {

       boolean isBulky = false, isHeavy = false;
       long volume = (long)length * width * height;
       String category = null;

       if ( mass >= 100) isHeavy = true;
       if ((length >= 10000 || width >= 10000 || height >= 10000) || (volume >= 1000000000)){
          isBulky = true;
       }

       if (isBulky && isHeavy) {
        return "Both";

       }
       if (isBulky == false && isHeavy == false) return "Neither";
       if (isBulky && !isHeavy) return "Bulky";
       
       return "Heavy";
   
    }
}