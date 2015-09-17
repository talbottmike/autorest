/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.validation;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.RestAdapter;
import com.google.gson.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import fixtures.validation.models.Product;
import fixtures.validation.models.Error;

/**
 * Initializes a new instance of the AutoRestValidationTest class.
 */
public class AutoRestValidationTestImpl extends ServiceClient implements AutoRestValidationTest {
    private AutoRestValidationTestService service;
    private String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    private String subscriptionId;

    /**
     * Gets Subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    private String apiVersion;

    /**
     * Gets Required string following pattern \d{2}-\d{2}-\d{4}
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Sets Required string following pattern \d{2}-\d{2}-\d{4}
     *
     * @param apiVersion the apiVersion value.
     */
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     */
    public AutoRestValidationTestImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestValidationTestImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestValidationTest client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param restAdapterBuilder the builder for building up a {@link RestAdapter}
     */
    public AutoRestValidationTestImpl(String baseUri, OkHttpClient client, RestAdapter.Builder restAdapterBuilder) {
        super(client, restAdapterBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        RestAdapter restAdapter = restAdapterBuilder.setEndpoint(baseUri).build();
        service = restAdapter.create(AutoRestValidationTestService.class);
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @return the Product object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Product validationOfMethodParameters(String resourceGroupName, int id) throws ServiceException {
        try {
            ServiceResponse<Product> response = validationOfMethodParametersDelegate(service.validationOfMethodParameters(this.getSubscriptionId(), resourceGroupName, id, this.getApiVersion()), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Product> response = validationOfMethodParametersDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void validationOfMethodParametersAsync(String resourceGroupName, int id, final ServiceCallback<Product> serviceCallback) {
        service.validationOfMethodParametersAsync(this.getSubscriptionId(), resourceGroupName, id, this.getApiVersion(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(validationOfMethodParametersDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Product> validationOfMethodParametersDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Product>()
                .register(200, new TypeToken<Product>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value
     * @return the Product object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Product validationOfBody(String resourceGroupName, int id, Product body) throws ServiceException {
        try {
            ServiceResponse<Product> response = validationOfBodyDelegate(service.validationOfBody(this.getSubscriptionId(), resourceGroupName, id, body, this.getApiVersion()), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Product> response = validationOfBodyDelegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public void validationOfBodyAsync(String resourceGroupName, int id, Product body, final ServiceCallback<Product> serviceCallback) {
        service.validationOfBodyAsync(this.getSubscriptionId(), resourceGroupName, id, body, this.getApiVersion(), new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(validationOfBodyDelegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Product> validationOfBodyDelegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Product>()
                .register(200, new TypeToken<Product>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}