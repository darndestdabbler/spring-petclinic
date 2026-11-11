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

/**
 * The arithmetic behind the calculator page: the sum and the difference of two numbers.
 */
public class Calculator {

	/**
	 * Adds two numbers.
	 * @param left the first number
	 * @param right the number added to it
	 * @return the sum of {@code left} and {@code right}
	 */
	public BigDecimal add(BigDecimal left, BigDecimal right) {
		return left.add(right);
	}

	/**
	 * Subtracts one number from another.
	 * @param left the number subtracted from
	 * @param right the number subtracted
	 * @return {@code left} minus {@code right}
	 */
	public BigDecimal subtract(BigDecimal left, BigDecimal right) {
		return left.subtract(right);
	}

}
