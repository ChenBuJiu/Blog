import org.apache.commons.lang.StringEscapeUtils;

public class Test {

	public static void main(String[] args) {
		String html="<html>";
		System.out.println(StringEscapeUtils.escapeHtml(html));
	}
}
