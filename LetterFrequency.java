// Vince Lepatan
//Part 2 of Problem one, this code finds the letter frequency according to the key length found from part 1.

import java.io.FileNotFoundException;

public class LetterFrequency
{
    public static void main (String [] args)  throws FileNotFoundException
    {
        String cipherText = "TXXJXEAESZEPZLBRMEGMCBXBJKWBNIIKWWVCMEEXMRTSYWGSYMMLESRUBHMAPITSEIDIHSSSFDSVFFPEPSXUFFTNVEPLWTOWSBOELPLIZBVMEERFFQXNKIQGSKPLIUFPIKJEPPQIWRCBGWHHHMRSWMKTVBUIVPXLRTILPVEAHIVNIEGVVXOJVBNZBKPIADITBXIEULTPXLRZVXPYVAFHMKPINEXAWXMYMJTPIHNEZTJGIGIIWAWGEJTMESRBGXAAMVQFEMDEWVUATOWIROFRPLIPSSPZXEYMMXOZIEZGEKWIYZABPLQLPAGEQTEFWLESRFULXPLVRFTNBJWBGKKAIRFNSDAXLREIXLLYZNMGCRSGFEGZXLRGPTOLIFPJYHEQR";
        char [] cipherArray = cipherText.toCharArray();

        //The nested for-loop is used to search through the entire cipher text depends its position
        //The first for loop sets the starting position of the search
        for (int startPosition = 0; startPosition < 7; startPosition++)
        {
            int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l =0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0,
                    s = 0, t = 0, u =0, v = 0, w = 0, x = 0, y = 0, z = 0;

            //The second for-loop counts the ammount of letters that appear on the current index
            for (int index = startPosition; index < cipherText.length(); index += 7) //Adding by 7 because it's the keylength
            {
                switch (cipherText.charAt(index))
                {
                    case 'A':
                        a++;
                        break;
                    case 'B':
                        b++;
                        break;
                    case 'C':
                        c++;
                        break;
                    case 'D':
                        d++;
                        break;
                    case 'E':
                        e++;
                        break;
                    case 'F':
                        f++;
                        break;
                    case 'G':
                        g++;
                        break;
                    case 'H':
                        h++;
                        break;
                    case 'I':
                        i++;
                        break;
                    case 'J':
                        j++;
                        break;
                    case 'K':
                        k++;
                        break;
                    case 'L':
                        l++;
                        break;
                    case 'M':
                        m++;
                        break;
                    case 'N':
                        n++;
                        break;
                    case 'O':
                        o++;
                        break;
                    case 'P':
                        p++;
                        break;
                    case 'Q':
                        q++;
                        break;
                    case 'R':
                        r++;
                        break;
                    case 'S':
                        s++;
                        break;
                    case 'T':
                        t++;
                        break;
                    case 'U':
                        u++;
                        break;
                    case 'V':
                        v++;
                        break;
                    case 'W':
                        w++;
                        break;
                    case 'X':
                        x++;
                        break;
                    case 'Y':
                        y++;
                        break;
                    case 'Z':
                        z++;
                        break;
                }
            }

            //Prints out the letter that occurs

            System.out.print("a: " + a + "\t");
            System.out.print("b: " + b + "\t");
            System.out.print("c: " + c + "\t");
            System.out.print("d: " + d + "\t");
            System.out.print("e: " + e + "\t");
            System.out.print("f: " + f + "\t");
            System.out.print("g: " + g + "\t");
            System.out.print("h: " + h + "\t");
            System.out.print("i: " + i + "\t");
            System.out.print("j: " + j + "\t");
            System.out.print("k: " + k + "\t");
            System.out.print("l: " + l + "\t");
            System.out.print("m: " + m + "\t");
            System.out.print("n: " + n + "\t");
            System.out.print("o: " + o + "\t");
            System.out.print("p: " + p + "\t");
            System.out.print("q: " + q + "\t");
            System.out.print("r: " + r + "\t");
            System.out.print("s: " + s + "\t");
            System.out.print("t: " + t + "\t");
            System.out.print("u: " + u + "\t");
            System.out.print("v: " + v + "\t");
            System.out.print("w: " + w + "\t");
            System.out.print("x: " + x + "\t");
            System.out.print("y: " + y + "\t");
            System.out.print("z: " + z + "\t");

            System.out.println();
        }
    }
}
