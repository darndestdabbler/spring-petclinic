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

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledInNativeImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(CalculatorController.class)
@DisabledInNativeImage
@DisabledInAotMode
class CalculatorControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void showForm() throws Exception {
		this.mockMvc.perform(get("/calculator"))
			.andExpect(status().isOk())
			.andExpect(view().name("calculators/calculator"));
	}

	@Test
	void calculate() throws Exception {
		this.mockMvc.perform(post("/calculator").param("left", "2.5").param("right", "4"))
			.andExpect(status().isOk())
			.andExpect(model().attribute("sum", new BigDecimal("6.5")))
			.andExpect(model().attribute("difference", new BigDecimal("-1.5")))
			.andExpect(view().name("calculators/calculator"));
	}

}
