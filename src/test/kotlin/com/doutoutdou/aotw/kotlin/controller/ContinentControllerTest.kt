package com.doutoutdou.aotw.kotlin.controller


import com.doutoutdou.aotw.kotlin.dto.ContinentDto
import com.doutoutdou.aotw.kotlin.service.ContinentService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.springframework.http.HttpStatus

class ContinentEntityDtoControllerTests {
    private val continents = mapOf(
        "1" to ContinentDto("continent1"),
        "2" to ContinentDto("continent2")
    )

//    private val controller = ContinentController()

//    @Test
//    fun `getContinents returns list of continents`() {
//        val result = controller.getContinents()
//        assertEquals(HttpStatus.OK, result.statusCode)
//        assertNotNull(result.body)
//        assertEquals(2, result.body?.size)
//        assertEquals("continent1", result.body?.get(0)?.name)
//        assertEquals("continent2", result.body?.get(1)?.name)
//    }
//
//    @Test
//    fun `getContinent returns continent by ID`() {
//        val result = controller.getContinent("1")
//        assertEquals(HttpStatus.OK, result.statusCode)
//        assertNotNull(result.body)
//        assertEquals("continent1", result.body?.name)
//    }
//
//    @Test
//    fun `getContinent returns 404 for non-existent ID`() {
//        val result = controller.getContinent("3")
//        assertEquals(HttpStatus.NOT_FOUND, result.statusCode)
//        assertNull(result.body)
//    }
}