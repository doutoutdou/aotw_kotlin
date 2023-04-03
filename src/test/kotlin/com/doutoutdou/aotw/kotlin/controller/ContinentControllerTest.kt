package com.doutoutdou.aotw.kotlin.controller


import com.doutoutdou.aotw.kotlin.dto.ContinentDto
import com.doutoutdou.aotw.kotlin.service.ContinentService
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus

class ContinentEntityDtoControllerTests {
    private val continents = mapOf(
        "1" to ContinentDto("continent1"),
        "2" to ContinentDto("continent2")
    )

    private lateinit var controller: ContinentController
    private lateinit var service: ContinentService

    @BeforeEach
    fun setup() {
        service = mockk(relaxed = true)
        controller = ContinentController(service)
    }

    @Test
    fun `list continents should return a list of continents`() {
        every { service.listContinents() } returns continents.values.toList()
        val result = controller.getContinents()
        assertEquals(HttpStatus.OK, result.statusCode)
        assertNotNull(result.body)
        assertEquals(2, result.body?.size)
        assertEquals("continent1", result.body?.get(0)?.name)
        assertEquals("continent2", result.body?.get(1)?.name)
    }

    @Test
    fun `get continent should return a continent when it exists`() {
        val id = 1L
        val expected = ContinentDto("name1", 1)
        every { service.getContinent(id) } returns expected
        val result = controller.getContinent(id)
        assertEquals(expected, result.body)
        assertEquals(HttpStatus.OK, result.statusCode)
    }

    @Test
    fun `get continent should return not found when it does not exist`() {
        val id = 3L
        every { service.getContinent(id) } returns null
        val result = controller.getContinent(id)
        assertNull(result.body)
        assertEquals(HttpStatus.NOT_FOUND, result.statusCode)
    }

    @Test
    fun `create continent should return a continent`() {
        val dto = ContinentDto(name = "continent3")
        val expected = ContinentDto(name = "Continent3", id = 3)
        every { service.createContinent(dto) } returns expected
        val result = controller.createContinent(dto)
        assertEquals(expected, result.body)
        assertEquals(HttpStatus.OK, result.statusCode)
    }

    @Test
    fun `delete continent should call service`() {
        val id = 1L
        every { service.deleteContinent(id) } returns Unit
        controller.deleteContinent(id)
        verify { service.deleteContinent(any()) }
    }
}