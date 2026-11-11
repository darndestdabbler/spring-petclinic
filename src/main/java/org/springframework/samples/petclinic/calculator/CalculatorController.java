/*
 * Copyright 2012-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.calculator;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * The calculator page at {@code /calculator}: a form for two numbers, and their sum and
 * difference once it is posted.
 */
@Controller
class CalculatorController {

	private static final String VIEW = "calculators/calculator";

	private final Calculator calculator = new Calculator();

	/**
	 * Shows the calculator form with no result.
	 * @return the calculator view
	 */
	@GetMapping("/calculator")
	public String showForm() {
		return VIEW;
	}

	/**
	 * Shows the sum and the difference of the two numbers posted.
	 * @param left the first number
	 * @param right the second number
	 * @param model receives both numbers, {@code sum} and {@code difference}
	 * @return the calculator view
	 */
	@PostMapping("/calculator")
	public String calculate(@RequestParam BigDecimal left, @RequestParam BigDecimal right, Model model) {
		model.addAttribute("left", left);
		model.addAttribute("right", right);
		model.addAttribute("sum", this.calculator.add(left, right));
		model.addAttribute("difference", this.calculator.subtract(left, right));
		return VIEW;
	}

}
