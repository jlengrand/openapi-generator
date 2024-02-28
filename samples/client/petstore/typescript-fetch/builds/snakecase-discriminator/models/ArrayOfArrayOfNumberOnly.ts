/* tslint:disable */
/* eslint-disable */
/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface ArrayOfArrayOfNumberOnly
 */
export interface ArrayOfArrayOfNumberOnly {
    /**
     * 
     * @type {Array<Array<number>>}
     * @memberof ArrayOfArrayOfNumberOnly
     */
    arrayArrayNumber?: Array<Array<number>>;
}

/**
 * Check if a given object implements the ArrayOfArrayOfNumberOnly interface.
 */
export function instanceOfArrayOfArrayOfNumberOnly(value: object): boolean {
    return true;
}

export function ArrayOfArrayOfNumberOnlyFromJSON(json: any): ArrayOfArrayOfNumberOnly {
    return ArrayOfArrayOfNumberOnlyFromJSONTyped(json, false);
}

export function ArrayOfArrayOfNumberOnlyFromJSONTyped(json: any, ignoreDiscriminator: boolean): ArrayOfArrayOfNumberOnly {
    if (json === undefined || json === null) {
        return json;
    }
    return {
        
        'arrayArrayNumber': !exists(json, 'ArrayArrayNumber') ? undefined : json['ArrayArrayNumber'],
    };
}

export function ArrayOfArrayOfNumberOnlyToJSON(value?: ArrayOfArrayOfNumberOnly | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'ArrayArrayNumber': value['arrayArrayNumber'],
    };
}

