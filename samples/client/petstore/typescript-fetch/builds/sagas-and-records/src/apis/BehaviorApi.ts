/* tslint:disable */
/* eslint-disable */
/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import type {
  GetBehaviorPermissionsResponse,
  GetBehaviorTypeResponse,
} from '../models/index';
import {
    GetBehaviorPermissionsResponseFromJSON,
    GetBehaviorPermissionsResponseToJSON,
    GetBehaviorTypeResponseFromJSON,
    GetBehaviorTypeResponseToJSON,
} from '../models/index';

export interface GetBehaviorPermissionsRequest {
    behaviorId: number;
}

export interface GetBehaviorTypeRequest {
    behaviorId: number;
}

/**
 * 
 */
export class BehaviorApi extends runtime.BaseAPI {

    /**
     * Get permissions for the behavior
     */
    async getBehaviorPermissionsRaw(requestParameters: GetBehaviorPermissionsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetBehaviorPermissionsResponse>> {
        if (!runtime.exists(requestParameters, 'behaviorId')) {
            throw new runtime.RequiredError(
                'behaviorId',
                'Required parameter "behaviorId" was null or undefined when calling getBehaviorPermissions().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fake_behavior/{behavior-id}/permissions`.replace(`{${"behavior-id"}}`, encodeURIComponent(String(requestParameters['behaviorId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetBehaviorPermissionsResponseFromJSON(jsonValue));
    }

    /**
     * Get permissions for the behavior
     */
    async getBehaviorPermissions(behaviorId: number, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetBehaviorPermissionsResponse> {
        const response = await this.getBehaviorPermissionsRaw({ behaviorId: behaviorId }, initOverrides);
        return await response.value();
    }

    /**
     * Get the type of behavior
     */
    async getBehaviorTypeRaw(requestParameters: GetBehaviorTypeRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<GetBehaviorTypeResponse>> {
        if (!runtime.exists(requestParameters, 'behaviorId')) {
            throw new runtime.RequiredError(
                'behaviorId',
                'Required parameter "behaviorId" was null or undefined when calling getBehaviorType().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/fake_behavior/{behavior-id}/type`.replace(`{${"behavior-id"}}`, encodeURIComponent(String(requestParameters['behaviorId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => GetBehaviorTypeResponseFromJSON(jsonValue));
    }

    /**
     * Get the type of behavior
     */
    async getBehaviorType(behaviorId: number, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<GetBehaviorTypeResponse> {
        const response = await this.getBehaviorTypeRaw({ behaviorId: behaviorId }, initOverrides);
        return await response.value();
    }

}
