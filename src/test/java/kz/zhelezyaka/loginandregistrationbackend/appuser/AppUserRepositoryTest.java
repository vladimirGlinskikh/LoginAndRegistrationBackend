package kz.zhelezyaka.loginandregistrationbackend.appuser;

import lombok.NonNull;
import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@Disabled
//class AppUserRepositoryTest {
//
//    @Autowired
//    private AppUserRepository underTest;
//
//    @Test
//    void itShouldCheckIfUserFindByEmail() {
//        // given
//        String email = "vladimir.v.@gmail.com";
//        AppUser user = new AppUser(
//                "Vladimir",
//                email,
//                AppUserRole.USER
//        );
//        underTest.save(user);
//        // when
//        Optional<AppUser> find = underTest.findByEmail(email);
//        // then
//        assertThat(find).isPresent();
//    }
//}