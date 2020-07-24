package com.enosh.articles.paragraph;

import com.enosh.articles.model.Paragraph;
import com.enosh.articles.repository.ParagraphRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ParagraphTests {

    @Autowired
    private ParagraphRepository repository;

    @Test
    void contextLoads() {
    }

    @Test
    void save() {
        Paragraph afterSave = repository.save(
                new Paragraph("\n" +
                        "רונית ורד\n" +
                        "צילום: דן פרץ\n" +
                        "קבל התראות בתיבת הדואר האלקטרוני שלך עבור כתבות מ רונית ורד\n" +
                        "התראות במייל\n" +
                        "פורסם ב-10:53\n" +
                        "זו שעת בוקר מוקדמת, ואנדראה בופה בוחן בקפידה את אשכולות הענבים התלויים בין עלי הגפנים. קרני שמש זהובות ורכות מאירות את הכרם שמשתרע לאורכו של ערוץ נחל בחבל עדולם, והענבים המופזים נדמים לאשכולות אבני חן ירוקות־סגולות. עבור היינן הצעיר, שנולד באיטליה ורוצה לייצר יינות מבעבעים ישראליים עם אופי מקומי מובהק, עונת הבוחל — זו שבה משנים הענבים את צבעם ורמת הסוכר בהם עולה — היא נקודת זמן קריטית. בימים ובשבועות הקרובים צריך להחליט מתי בדיוק לבצור את הזנים השונים."
                )
        );

        System.out.println(afterSave);
    }

}
