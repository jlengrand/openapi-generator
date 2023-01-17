# coding: utf-8

"""
    OpenAPI Petstore

    This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import petstore_api
from petstore_api.models.object_with_deprecated_fields import ObjectWithDeprecatedFields  # noqa: E501
from petstore_api.rest import ApiException

class TestObjectWithDeprecatedFields(unittest.TestCase):
    """ObjectWithDeprecatedFields unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test ObjectWithDeprecatedFields
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = petstore_api.models.object_with_deprecated_fields.ObjectWithDeprecatedFields()  # noqa: E501
        if include_optional :
            return ObjectWithDeprecatedFields(
                uuid = '', 
                id = 1.337, 
                deprecated_ref = petstore_api.models.deprecated_object.DeprecatedObject(
                    name = '', ), 
                bars = [
                    'bar'
                    ]
            )
        else :
            return ObjectWithDeprecatedFields(
        )

    def testObjectWithDeprecatedFields(self):
        """Test ObjectWithDeprecatedFields"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
