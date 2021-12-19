package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseConstraintValidator implements ConstraintValidator<CouponCode, String> {
	
	private String couponCode;
	
	public void initialize(CouponCode theCouponCode) {
		couponCode = theCouponCode.value();
	}

	@Override
	public boolean isValid(String inputCode, ConstraintValidatorContext newConstraintValidatorContext) {
		boolean result;
		if(inputCode != null) {
			result = inputCode.startsWith(couponCode);
		}else {
			return true;
		}
		return result;
	}

}
