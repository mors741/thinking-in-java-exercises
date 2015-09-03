/******************************* Exercise 11 ********************************
 * Turn the AllTheColorsOfTheRainbow example into a program that
 * compiles and runs. 
 ***************************************************************************/

package c1_everything_is_an_object;

public class E11_AllTheColorsOfTheRainbow {
	int anIntagerRepresentingColors;
	void changeTheHueOfTheColor(int newHue) {
		anIntagerRepresentingColors = newHue;
	}
	public static void main(String[] args) {
		E11_AllTheColorsOfTheRainbow colors = new E11_AllTheColorsOfTheRainbow();
		colors.changeTheHueOfTheColor(27);

	}

}
