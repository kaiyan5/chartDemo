

import com.lowagie.text.*;
import com.lowagie.text.Image;
import com.lowagie.text.rtf.RtfWriter2;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;



/**
 * Created by zhonghuan on 17/5/18.
 */
public class ExpModelPersonal {
    public static void createDocFile(String file) throws DocumentException,
            IOException, ParseException {
// 设置纸张大小
        Document document = new Document(PageSize.A4);
// 建立一个书写器(Writer)与document对象关联，通过书写器(Writer)可以将文档写入到磁盘中

        RtfWriter2.getInstance(document, new FileOutputStream(file));
        document.open();
// 将Phrases添加到document文档
        document.add(FontSettingC.setFirstTitle("报告目录"));
        document.add(FontSettingC
                        .setSecondTitle("（一）领导力行为指标\n" +
                "（二）评估整体概况\n"+
"（三）优势与待发展\n" +
"（四）自我认知偏差\n" +
"（五）他评分歧（他评差异大的行为；不同人眼中表现突出的行为）\n" +
"（六）发展建议\n" +
"（七）行动计划\n" +
"（八）附录：文本题反馈\n" +
"（九）附录：得分详情\n"));

        document.add(getTargetSpread());
        document.close();
    }

    public static Image setImage(String url)
            throws BadElementException, MalformedURLException, IOException {
        // 添加图片
        Image img_spider = Image.getInstance(url);
        // 设置图片大小(H,W)
        img_spider.scaleAbsolute(300, 130);
        img_spider.setAlignment(Element.ALIGN_CENTER);
        img_spider.setSpacingBefore(50);
        return img_spider;
    }
    public static Table getTargetSpread() throws DocumentException,
            IOException, ParseException {
        Table table1 = new Table(2);// 创建该表格的列数，在本程序中设为5列
        int width1[] = { 10, 20 };// 每列的单元格的宽度
        table1.setWidths(width1);// 设置每列所占比例
        table1.setWidth(100); // 占页面宽度 90%，相当于html中width属性

        table1.setAlignment(Element.ALIGN_CENTER);// 设置该表格中的元素水平方向居中显示
        table1.setAutoFillEmptyCells(true); // 自动填满
        table1.setBorderColor(new Color(160, 32, 240)); // 边框颜色
        /*table1.addCell(ItextTableStyle.DeepBlueRowSpan("素质项", 2));
        table1.addCell(ItextTableStyle.DeepBlueRowSpan("得分", 2));
        table1.addCell(ItextTableStyle.deepBlue("人员分布", 4));
        table1.addCell(ItextTableStyle.deepBlue("比例分布", 4));
        table1.addCell(ItextTableStyle.DeepBlueRowSpan("总分居于前20%的是", 2));
        table1.addCell(ItextTableStyle.DeepBlueRowSpan("总分居于后10%的是", 2));
        table1.addCell(ItextTableStyle.DeepBlueRowSpan("1.0分\n↓\n2.0分", 1));
        table1.addCell(ItextTableStyle.DeepBlueRowSpan("2.0分\n↓\n3.0分", 1));
        table1.addCell(ItextTableStyle.DeepBlueRowSpan("3.0分\n↓\n4.0分", 1));
        table1.addCell(ItextTableStyle.DeepBlueRowSpan("4.0分\n↓\n5.0分", 1));
        table1.addCell(ItextTableStyle.DeepBlueRowSpan("1.0分\n↓\n2.0分", 1));
        table1.addCell(ItextTableStyle.DeepBlueRowSpan("2.0分\n↓\n3.0分", 1));
        table1.addCell(ItextTableStyle.DeepBlueRowSpan("3.0分\n↓\n4.0分", 1));
        table1.addCell(ItextTableStyle.DeepBlueRowSpan("4.0分\n↓\n5.0分", 1));
       */ Cell cell = new Cell(setImage("/Users/zhonghuan/gitProgram/chartDemo/company.jpeg"));
        cell.setColspan (2);
        table1.addCell(cell);
        return table1;
    }
    public static void main(String[] args) throws DocumentException, ParseException, IOException {
        createDocFile("test.doc");
    }

}
