package com.pwr.project;

import com.pwr.project.entities.Notice;
import com.pwr.project.entities.datatypes.NoticeStatus;
import com.pwr.project.repositories.NoticeRepository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.not;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BasicCRUDTests {

//    @Autowired
//    private NoticeRepository noticeRepository;
//
//    private Long createdNoticeId;  // Nowa zmienna do przechowywania ID utworzonego ogłoszenia
//
//    @Test
//    @Order(1)
//    @Rollback(value = false)
//    public void createNoticeTest() {
//        Notice notice = Notice.builder()
//                .title("Test title 123")
//                .description("Test description 123")
//                .tags(new HashSet<>(Arrays.asList("test", "automation")))
//                .noticeStatus(NoticeStatus.Live)
//                .sellerNumber("845793234")
//                .createdBy("test@automation.com")
//                .build();
//
//        // Zapisz ogłoszenie
//        Notice savedNotice = noticeRepository.save(notice);
//
//        // Upewnij się, że ID ogłoszenia nie jest null
//        assertNotNull(savedNotice.getId(), "Notice ID should not be null after saving.");
//
//        // Zapisz ID utworzonego ogłoszenia
//        createdNoticeId = savedNotice.getId();
//
//        // Teraz spróbuj znaleźć ogłoszenie
//        Optional<Notice> retrievedNotice = noticeRepository.findById(createdNoticeId);
//        assertTrue(retrievedNotice.isPresent(), "Notice should be present after saving.");
//        assertThat(retrievedNotice.get().getTitle()).isEqualTo("Test title 123");
//    }
//
//
//    @Test
//    @Order(2)
//    @Rollback(value = false)
//    public void getNoticeItemTest() {
//        Optional<Notice> notice = noticeRepository.findById(createdNoticeId); // Użyj ID utworzonego ogłoszenia
//        assertThat(notice).isPresent();  // Sprawdź, czy ogłoszenie istnieje
//    }
//
//    @Test
//    @Order(3)
//    @Rollback(value = false)
//    public void getNoticesTest() {
//        List<Notice> noticeList = noticeRepository.findAll();
//        assertThat(noticeList.size()).isGreaterThan(0);
//    }
//
//    @Test
//    @Order(4)
//    @Rollback(value = false)
//    public void updateNoticeTest() {
//            Optional<Notice> notice = noticeRepository.findById(createdNoticeId); // Użyj ID utworzonego ogłoszenia
//        assertThat(notice).isPresent();  // Sprawdź, czy ogłoszenie istnieje
//
//        notice.ifPresent(n -> {
//            n.setNoticeStatus(NoticeStatus.Archived);
//            Notice updatedNotice = noticeRepository.save(n);
//            assertThat(updatedNotice.getNoticeStatus()).isEqualTo(NoticeStatus.Archived);
//        });
//    }
}
