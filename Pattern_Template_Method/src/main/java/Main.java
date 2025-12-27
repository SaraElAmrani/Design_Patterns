import templates.Template;
import templates.Template1Impl;
import templates.Template2Impl;

public class Main {
    public static void main(String[] args) {
        Template template = new Template1Impl();
        System.out.println(template.perform(2, 5));
        template = new Template2Impl();
        System.out.println(template.perform(2, 5));

    }
}
