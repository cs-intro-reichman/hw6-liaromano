import java.awt.Color;
public class Editor4 {
    public static void main (String[] args){
		//// Replace this comment with your code.
		//// This function is similar to the main function of Editor1.java
            String source = args[0];
            int n= Integer.parseInt(args[1]);
            Color[][] sourceImage = Runigram.read(source);
            Color[][] target = Runigram.grayScaled(sourceImage);
            Runigram.setCanvas(sourceImage);
            Runigram.morph(sourceImage, target, n);
        }
}