import com.lowagie.text.Element;
import com.lowagie.text.Paragraph;

/**
 * Created by zhonghuan on 17/5/19.
 */
public class FontSettingC {

    public static Paragraph setFirstTitle(String companyTheme){
        Paragraph paragraph=new Paragraph(companyTheme);
        paragraph.setAlignment(Element.ALIGN_CENTER);
        paragraph.setSpacingBefore(90);
        paragraph.setSpacingAfter(0);
        //Font themeFont=new Font();
        return paragraph;

    }
    public static Paragraph setSecondTitle(String companyTheme){
        Paragraph paragraph=new Paragraph(companyTheme);
        paragraph.setAlignment(Element.ALIGN_CENTER);
        paragraph.setSpacingBefore(90);
        paragraph.setSpacingAfter(0);
        //Font themeFont=new Font();
        return paragraph;

    }
}
