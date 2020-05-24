//Vince Lepatan
//Part 1 of problem 1, this code finds the keylength.


public class FindingTheKeyLength
{
    public static void main (String [] args)
    {
        String cipherText = "TXXJXEAESZEPZLBRMEGMCBXBJKWBNIIKWWVCMEEXMRTSYWGSYMMLESRUBHMAPITSEIDIHSSSFDSVFFPEPSXUFFTNVEPLWTOWSBOELPLIZBVMEERFFQXNKIQGSKPLIUFPIKJEPPQIWRCBGWHHHMRSWMKTVBUIVPXLRTILPVEAHIVNIEGVVXOJVBNZBKPIADITBXIEULTPXLRZVXPYVAFHMKPINEXAWXMYMJTPIHNEZTJGIGIIWAWGEJTMESRBGXAAMVQFEMDEWVUATOWIROFRPLIPSSPZXEYMMXOZIEZGEKWIYZABPLQLPAGEQTEFWLESRFULXPLVRFTNBJWBGKKAIRFNSDAXLREIXLLYZNMGCRSGFEGZXLRGPTOLIFPJYHEQR";

        char [] cipherArray = cipherText.toCharArray();  // Set the cipher text into a character array
        char [] shiftedText = new char[cipherArray.length]; // Setting the shifted cipher text as long as the cipher array

        // Setting the two arrays to equal each other
        for (int i = 0; i < cipherArray.length; i++)
        {
            shiftedText [i] = cipherArray [i];
        }

        //First for-loop is used to "shift" the array
        // Variable 'i' is used to change the index of cipherArray
        for (int i = 1; i < 13; i++)
        {
            int count = 0; // counter for amount of coincidences

            // Second for-loop is used to compare the indexes of each array
            for (int j = 0; j < (shiftedText.length - i); j++)
            {
                if (cipherArray [j + i] == shiftedText [j]) // Example cipherArray [5] == shiftedText [4] for 1 shift
                    count ++;
            }
            System.out.println("Shift " + i + ": ");
            System.out.println(count + " coincidences");
        }
    }
}
