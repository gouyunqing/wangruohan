package com.example.wangruohan.serviceTest;

import com.example.wangruohan.domain.Artist;
import com.example.wangruohan.service.IArtistService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
public class ArtistServiceTest {

    @Autowired
    private IArtistService artistService;

    @Test
    void testSave() throws ParseException {
        Artist artist = new Artist();
        String str_date = "1998-02-14";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = simpleDateFormat.parse(str_date);
        artist.setName("缑允卿");
        artist.setBirthday(birthday);
        artist.setGender("male");
        artist.setStageName("Kenny");

        artistService.save(artist);

    }
}
