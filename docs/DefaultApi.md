# DefaultApi

All URIs are relative to *http://devapi.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**coursesGet**](DefaultApi.md#coursesGet) | **GET** /courses | 
[**coursesIdDelete**](DefaultApi.md#coursesIdDelete) | **DELETE** /courses/{id} | 
[**coursesIdGet**](DefaultApi.md#coursesIdGet) | **GET** /courses/{id} | 
[**coursesPost**](DefaultApi.md#coursesPost) | **POST** /courses | 
[**studentGet**](DefaultApi.md#studentGet) | **GET** /student | 
[**studentIdDelete**](DefaultApi.md#studentIdDelete) | **DELETE** /student/{id} | 
[**studentIdGet**](DefaultApi.md#studentIdGet) | **GET** /student/{id} | 
[**studentPost**](DefaultApi.md#studentPost) | **POST** /student | 
[**studentStudentIdCoursesGet**](DefaultApi.md#studentStudentIdCoursesGet) | **GET** /student/{studentId}/courses | 
[**studentStudentIdCoursesPost**](DefaultApi.md#studentStudentIdCoursesPost) | **POST** /student/{studentId}/courses | 

<a name="coursesGet"></a>
# **coursesGet**
> List&lt;Course&gt; coursesGet(coursename)



Fetch Course resource

### Example
```java
// Import classes:
//import com.example.api.handler.ApiException;
//import com.example.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String coursename = "coursename_example"; // String | 
try {
    List<Course> result = apiInstance.coursesGet(coursename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#coursesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coursename** | **String**|  | [optional]

### Return type

[**List&lt;Course&gt;**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coursesIdDelete"></a>
# **coursesIdDelete**
> coursesIdDelete(id)



### Example
```java
// Import classes:
//import com.example.api.handler.ApiException;
//import com.example.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | 
try {
    apiInstance.coursesIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#coursesIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="coursesIdGet"></a>
# **coursesIdGet**
> Course coursesIdGet(id)



### Example
```java
// Import classes:
//import com.example.api.handler.ApiException;
//import com.example.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | 
try {
    Course result = apiInstance.coursesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#coursesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**Course**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="coursesPost"></a>
# **coursesPost**
> coursesPost(body)



Add new course

### Example
```java
// Import classes:
//import com.example.api.handler.ApiException;
//import com.example.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Course body = new Course(); // Course | 
try {
    apiInstance.coursesPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#coursesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Course**](Course.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="studentGet"></a>
# **studentGet**
> List&lt;Student&gt; studentGet(studentname, page, size)



Fetch Student resource

### Example
```java
// Import classes:
//import com.example.api.handler.ApiException;
//import com.example.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String studentname = "studentname_example"; // String | 
Integer page = 56; // Integer | 
Integer size = 56; // Integer | 
try {
    List<Student> result = apiInstance.studentGet(studentname, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#studentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentname** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **size** | **Integer**|  | [optional]

### Return type

[**List&lt;Student&gt;**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="studentIdDelete"></a>
# **studentIdDelete**
> studentIdDelete(id)



### Example
```java
// Import classes:
//import com.example.api.handler.ApiException;
//import com.example.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | 
try {
    apiInstance.studentIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#studentIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="studentIdGet"></a>
# **studentIdGet**
> Student studentIdGet(id)



### Example
```java
// Import classes:
//import com.example.api.handler.ApiException;
//import com.example.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | 
try {
    Student result = apiInstance.studentIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#studentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

[**Student**](Student.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="studentPost"></a>
# **studentPost**
> studentPost(body)



Add new student

### Example
```java
// Import classes:
//import com.example.api.handler.ApiException;
//import com.example.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Student body = new Student(); // Student | 
try {
    apiInstance.studentPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#studentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Student**](Student.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="studentStudentIdCoursesGet"></a>
# **studentStudentIdCoursesGet**
> List&lt;Course&gt; studentStudentIdCoursesGet(studentId)



### Example
```java
// Import classes:
//import com.example.api.handler.ApiException;
//import com.example.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer studentId = 56; // Integer | 
try {
    List<Course> result = apiInstance.studentStudentIdCoursesGet(studentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#studentStudentIdCoursesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **Integer**|  |

### Return type

[**List&lt;Course&gt;**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="studentStudentIdCoursesPost"></a>
# **studentStudentIdCoursesPost**
> studentStudentIdCoursesPost(studentId, body)



Add new course

### Example
```java
// Import classes:
//import com.example.api.handler.ApiException;
//import com.example.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer studentId = 56; // Integer | 
List<Course> body = Arrays.asList(new Course()); // List<Course> | 
try {
    apiInstance.studentStudentIdCoursesPost(studentId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#studentStudentIdCoursesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **studentId** | **Integer**|  |
 **body** | [**List&lt;Course&gt;**](Course.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

