package dev.sch39.ecommerce.controllers.user.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.sch39.ecommerce.dtos.rest.response.RestCategoryUserResponseDto;
import dev.sch39.ecommerce.entities.CategoryEntity;
import dev.sch39.ecommerce.services.CategoryService;
import dev.sch39.ecommerce.utils.ApiResponse;
import dev.sch39.ecommerce.utils.ErrorApiResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController("UserRestCategoryController")
@RequestMapping("/api/categories")
public class RestCategoryController {
  @Autowired
  CategoryService categoryService;

  // @GetMapping({ "", "/" })
  // public ResponseEntity<ApiResponse<?>> getAll() {
  // ApiResponse<List<RestCategoryUserResponseDto>> apiResponse = new
  // ApiResponse<>();
  // try {
  // List<CategoryEntity> categories = categoryService.getAllCategory(false);
  // List<RestCategoryUserResponseDto> dtos = new ArrayList<>();

  // for (CategoryEntity category : categories) {
  // RestCategoryUserResponseDto dto = new RestCategoryUserResponseDto();
  // dto.setId(category.getId());
  // dto.setName(category.getName());
  // dto.setDescription(category.getDescription());
  // dto.setSlug(category.getSlug());
  // dto.setCreatedAt(category.getCreatedAt());
  // dto.setUpdatedAt(category.getUpdatedAt());

  // dtos.add(dto);
  // }
  // apiResponse.setSuccess(true);
  // apiResponse.setMessage("Success get all category");
  // apiResponse.setData(dtos);

  // return new ResponseEntity<>(apiResponse, HttpStatus.OK);
  // } catch (Exception e) {
  // ErrorApiResponse<?> errorApiResponse = new ErrorApiResponse<>();
  // errorApiResponse.setSuccess(false);
  // errorApiResponse.setMessage(e.getMessage());
  // errorApiResponse.setErrorCode(e.hashCode());
  // return new ResponseEntity<>(errorApiResponse,
  // HttpStatus.INTERNAL_SERVER_ERROR);
  // }
  // }

  // @GetMapping({ "{slug}", "{slug}/" })
  // public ResponseEntity<ApiResponse<?>> getBySlug(@PathVariable("slug") String
  // slug) {
  // ApiResponse<RestCategoryUserResponseDto> apiResponse = new ApiResponse<>();

  // try {
  // CategoryEntity category = categoryService.getCategoryBySlug(slug);
  // RestCategoryUserResponseDto dto = new RestCategoryUserResponseDto();
  // dto.setId(category.getId());
  // dto.setName(category.getName());
  // dto.setSlug(category.getSlug());
  // dto.setDescription(category.getDescription());
  // dto.setCreatedAt(category.getCreatedAt());
  // dto.setUpdatedAt(category.getUpdatedAt());

  // apiResponse.setSuccess(true);
  // apiResponse.setMessage("Success get category");
  // apiResponse.setData(dto);

  // return new ResponseEntity<>(apiResponse, HttpStatus.OK);
  // } catch (Exception e) {
  // ErrorApiResponse<?> errorApiResponse = new ErrorApiResponse<>();
  // errorApiResponse.setSuccess(false);
  // errorApiResponse.setMessage(e.getMessage());
  // errorApiResponse.setErrorCode(e.hashCode());
  // return new ResponseEntity<>(errorApiResponse,
  // HttpStatus.INTERNAL_SERVER_ERROR);
  // }
  // }

}
