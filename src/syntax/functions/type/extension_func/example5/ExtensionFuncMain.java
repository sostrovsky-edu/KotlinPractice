package syntax.functions.type.extension_func.example5;

import static syntax.functions.type.extension_func.example5.StringExtensionKt.lastChar;

public class ExtensionFuncMain {
    public static void main(String[] args) {
        String str = "Java";

        // System.out.println("Last character of the " +str+ " is: " +StringExtensionKt.lastChar(str));
        System.out.println("Last character of the " +str+ " is: " +lastChar(str));
    }
}
