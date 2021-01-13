package WrapperClass;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class SumOfNumbers {

    public static String input = "Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/bin/java -javaagent:" +
            "/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=58089:/Applications/IntelliJ IDECE.app/Contents" +
            "/bin -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre" +
            "/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/deploy.jar:" +
            "/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:" +
            "/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/dnsns.jar:" +
            "/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/jaccess.jar:" +
            "/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:" +
            "/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/" +
            "JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/" +
            "jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/" +
            "Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/" +
            "Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/ext/" +
            "zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/" +
            "JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/" +
            "jdk1.8.0_271.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/" +
            "Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/" +
            "jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/management-agent.jar:" +
            "/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/" +
            "jdk1.8.0_271.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/" +
            "jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/lib/ant-javafx.jar:/" +
            "Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/" +
            "jdk1.8.0_271.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/" +
            "Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/lib/packager.jar:/Library/" +
            "Java/JavaVirtualMachines/jdk1.8.0_271.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/" +
            "jdk1.8.0_271.jdk/Contents/Home/lib/tools.jar:/Users/techtorial/IdeaProjects/TechtorialB7/out/production/" +
            "TechtorialB7 WrapperClass.StringToPrimitive";

    //Create one method will take the value of String and return sum of all the numbers from string.
    //Create one method will take the value of String and will return all the numbers?
    public static void main(String[] args) {
        sum();
    }
    public static void sum() {
        Long result = 0L;
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.print(m.group());
            result += Long.parseLong(m.group());
        }
        System.out.println("\n\nTotal Result: " + result);
    }
}

