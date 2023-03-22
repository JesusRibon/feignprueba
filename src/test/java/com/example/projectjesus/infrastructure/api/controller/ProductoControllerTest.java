package com.example.projectjesus.infrastructure.api.controller;

import static org.mockito.Mockito.when;

import com.example.projectjesus.application.ProductoDelete;
import com.example.projectjesus.application.ProductoGet;
import com.example.projectjesus.application.ProductoSave;
import com.example.projectjesus.application.ProductoUpdate;
import com.example.projectjesus.domain.entities.Producto;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pkcs.bc.BcPKCS10CertificationRequestBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(value = ProductoController.class)
class ProductoControllerTest {
  @Autowired
  private MockMvc mockMvc;

  private ObjectMapper objectMapper = new ObjectMapper();

  @MockBean
  private ProductoSave productoSave;

  @MockBean
  private ProductoGet productoGet;
  @MockBean
  private ProductoDelete productoDelete;
  @MockBean
  private ProductoUpdate productoUpdate;










  @Test
  void saveProducto() {
  }

  @Test
  void getAllProducto() throws Exception{




  }

  @Test
  void getProducto() {
  }

  @Test
  void updateProducto() {
  }

  @Test
  void deleteProducto() {
  }
}