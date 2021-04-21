package kr.ac.hansung.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class Subject {
	private int year;
	private int term;
	
	@Size(min = 2, max = 100, message = "교과목명은 영문(2~100), 한글 (1~50) 글자 입력이 필수입니다.")
	private String name;
	@Size(min = 2, max = 100, message = "교과구분은 영문(2~100), 한글 (1~50) 글자 입력이 필수입니다.")
	private String classification;
	@Size(min = 2, max = 100, message = "교수명은 영문(2~100), 한글 (1~50) 글자 입력이 필수입니다.")
	private String professor;
	@Digits(message="학점은 2자리수 정수로 입력해주세요.", fraction = 0, integer = 2)
	@Min(value = 1, message="1~21")
	@Max(value = 21, message="1~21")
	private int credit;
}
