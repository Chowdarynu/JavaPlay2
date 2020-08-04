package core.java8;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import static java.time.format.DateTimeFormatter.ofPattern;

public class InstantDemo {
   public static void main(String[] args) {
      Instant instant = Instant.now();
      System.out.println(instant);


      //Timestamp timestamp = Timestamp.from(instant);

      DateTimeFormatter formatter = ofPattern("yyyy-MM-dd HH:mm:ss");

      String format = formatter.format(LocalDateTime.ofEpochSecond(instant.getEpochSecond(), 0, ZoneOffset.UTC));
      Timestamp timestamp1 = (Timestamp) Timestamp.valueOf(format);


      OffsetDateTime odt = OffsetDateTime.now(ZoneOffset.UTC);



      LocalDateTime local_date_1 = LocalDateTime.parse(format, formatter);

      //System.out.println(timestamp);
      System.out.println(timestamp1);
      System.out.println(odt);

     /* LocalDateTime currentDateTime = LocalDateTime.now();

      DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
      String formatDateTime2 = currentDateTime.format(format2);
      System.out.println(local_date_1);*/


   }
}
