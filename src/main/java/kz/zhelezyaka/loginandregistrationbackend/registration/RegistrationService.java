package kz.zhelezyaka.loginandregistrationbackend.registration;

import kz.zhelezyaka.loginandregistrationbackend.appuser.AppUser;
import kz.zhelezyaka.loginandregistrationbackend.appuser.AppUserRole;
import kz.zhelezyaka.loginandregistrationbackend.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {
    private final AppUserService appUserService;
    private final EmailValidator emailValidator;

    public String register(RegistrationRequest request) {
        final boolean isValidEmail =
                emailValidator.test(request.getEmail());
        if (!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }
        return appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );
    }
}
