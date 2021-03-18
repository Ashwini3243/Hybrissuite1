package de.hybris.trainingShirisha.storefront.CustomValidators;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.RegistrationValidator;
import de.hybris.trainingShirisha.storefront.cusom.form.CustomRegisterForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
@Component("customRegistrationValidator")
public class CustomRegistrationValidator extends RegistrationValidator {
    @Override
    public boolean supports(Class<?> aClass) {
        return super.supports(aClass);
    }

    @Override
    public void validate(Object object, Errors errors) {
        super.validate(object, errors);
        final CustomRegisterForm registerForm = (CustomRegisterForm) object;
        final boolean newBusinessUser = registerForm.isNewBusinessUser();
        validateIsBusinessUser(errors, newBusinessUser);
    }
        protected void validateIsBusinessUser(final Errors errors, final boolean newBusinessUser)
        {
            if (!newBusinessUser)
            {
                errors.rejectValue("newBusinessUser", "register.newBusinessUser.not.accepted");
            }
        }
    }
