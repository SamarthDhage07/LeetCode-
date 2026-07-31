
class Solution {
    public int minimumPushes(String word) {

        int sum=0;
        int count=0;

        int arr[]=new int[26]; 
        for(int i =0; i<word.length(); i++) {
            arr[word.charAt(i)-'a']++;          // adding the frequency of the character
        }

        
        Arrays.sort(arr);

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } 

        int i=0;

        while(i<26 && arr[i] != 0) {

            if(i < 8) {
                sum += arr[i];
            }
            else if(i>=8 && i<16) {
                sum+= 2*(arr[i]);
            }
            else if(i>=16 && i<24) {
                sum+=3*(arr[i]);
            }
            else{
                sum += 4*(arr[i]);
            }
            i++;
        }

        return sum;  
    }
}