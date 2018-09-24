  public int[] plusOne(int[] digits) {
      int extra = 1;
      int temp = 0;
      for(int i=digits.length-1; i>=0; i--){
          digits[i] = extra+digits[i];
          temp = digits[i]%10;
          extra = digits[i]/10;
          digits[i] = temp;                
      }
      if(extra > 0){
          int[] result = new int[digits.length+1];
          result[0] = 1;
          System.arraycopy(digits, 0, result, 1, digits.length);
          return result;
      } else {
          return digits;
      }
  }
