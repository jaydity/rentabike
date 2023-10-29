package com.dbmsproj.rentabike.Service;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.MalformedURLException;

@Service
public class receiptGenerator {
    public void export(HttpServletResponse response) throws IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();
        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16);
        Font fontSubtitle = FontFactory.getFont(FontFactory.HELVETICA, 14);

        Paragraph paragraph1 = new Paragraph("\t\t\t\t\t\t\t\t\t\t\t\tRentABike Bike Rental Services", fontTitle);
        Paragraph paragraph2 = new Paragraph("Address: Bidar, Karnataka, India", fontSubtitle);

        paragraph1.setAlignment(Paragraph.ALIGN_RIGHT);
        paragraph2.setAlignment(Paragraph.ALIGN_CENTER);

        Image logo = Image.getInstance("src/main/resources/static/images/RentABike_logo.png");
        logo.setAlignment(Image.ALIGN_LEFT);
        logo.scaleAbsolute(100,100);

        Table table = new Table(2);
        table.setWidths(new int[]{120, 500});
        table.addCell(createImageCell("src/main/resources/static/images/RentABike_logo.png"));
        table.addCell(paragraph1);


        Font fontParagraph = FontFactory.getFont(FontFactory.HELVETICA, 12);

        String newLine = "_";
        for(int i=0; i<77; i++) {
            newLine += "_";
        }
        Paragraph blankLine = new Paragraph(newLine, fontParagraph);
        Paragraph paragraph3 = new Paragraph("Booking Details cum Receipt", fontParagraph);
        paragraph3.setAlignment(Paragraph.ALIGN_CENTER);

        Table details = new Table(2);
        details.setWidths(new int[]{200, 200});
        details.addCell("Booking ID");
        details.addCell("Booking ID Should come here");
        details.addCell("Customer Name");
        details.addCell("Customer Name Should come here");
        details.addCell("Customer Phone");
        details.addCell("Customer Phone Should come here");
        details.addCell("Bike Registration Number");
        details.addCell("Bike Registration Number Should come here");
        details.addCell("Bike Model");
        details.addCell("Bike Model Should come here");
        details.addCell("Bike Pickup time");
        details.addCell("Bike Pickup time Should come here");
        details.addCell("Bike Drop time");
        details.addCell("Bike Drop time Should come here");
        details.addCell("Bike Rent per hour");
        details.addCell("Bike Rent per hour Should come here");
        details.addCell("Hours");
        details.addCell("Hours Should come here");
        details.addCell("Total Rent");
        details.addCell("Total Rent Should come here");
        details.addCell("Total Payment");
        details.addCell("Total Payment Should come here");
        details.addCell("Booking Time");
        details.addCell("Booking Time Should come here");

        Paragraph thanks = new Paragraph("Thank you for choosing RentABike Bike Rental Services.\nWe hope you had a great experience with us.\nPlease visit us again.", fontParagraph);
        thanks.setAlignment(Paragraph.ALIGN_CENTER);
        // Add things here
        document.add(table);
        document.add(paragraph2);
        document.add(blankLine);
        document.add(paragraph3);
        document.add(blankLine);
        document.add(details);
        document.add(blankLine);
        document.add(thanks);
        document.close();

    }

    public static Cell createImageCell(String imgPath) throws IOException {
        Image img = Image.getInstance(imgPath);
        img.scaleAbsolute(100,100);
        Cell cell = new Cell();
        cell.setUseBorderPadding(true);
        cell.add(img);
        cell.setBorderWidth(0);
        return cell;
    }

//    public static Cell createTextCell(String text) throws IOException {
//        Cell cell = new Cell();
//        Paragraph p = new Paragraph(text);
//        p.setAlignment(Paragraph.ALIGN_CENTER);
//        cell.add(p);
//        cell.setBorderWidth(0);
//        return cell;
//    }
}
