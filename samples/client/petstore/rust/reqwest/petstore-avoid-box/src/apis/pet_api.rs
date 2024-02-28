/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */


use reqwest;

use crate::{apis::ResponseContent, models};
use super::{Error, configuration};

/// struct for passing parameters to the method [`add_pet`]
#[derive(Clone, Debug)]
pub struct AddPetParams {
    /// Pet object that needs to be added to the store
    pub pet: models::Pet
}

/// struct for passing parameters to the method [`delete_pet`]
#[derive(Clone, Debug)]
pub struct DeletePetParams {
    /// Pet id to delete
    pub pet_id: i64,
    pub api_key: Option<String>
}

/// struct for passing parameters to the method [`find_pets_by_status`]
#[derive(Clone, Debug)]
pub struct FindPetsByStatusParams {
    /// Status values that need to be considered for filter
    pub status: Vec<String>
}

/// struct for passing parameters to the method [`find_pets_by_tags`]
#[derive(Clone, Debug)]
pub struct FindPetsByTagsParams {
    /// Tags to filter by
    pub tags: Vec<String>
}

/// struct for passing parameters to the method [`get_pet_by_id`]
#[derive(Clone, Debug)]
pub struct GetPetByIdParams {
    /// ID of pet to return
    pub pet_id: i64
}

/// struct for passing parameters to the method [`update_pet`]
#[derive(Clone, Debug)]
pub struct UpdatePetParams {
    /// Pet object that needs to be added to the store
    pub pet: models::Pet
}

/// struct for passing parameters to the method [`update_pet_with_form`]
#[derive(Clone, Debug)]
pub struct UpdatePetWithFormParams {
    /// ID of pet that needs to be updated
    pub pet_id: i64,
    /// Updated name of the pet
    pub name: Option<String>,
    /// Updated status of the pet
    pub status: Option<String>
}

/// struct for passing parameters to the method [`upload_file`]
#[derive(Clone, Debug)]
pub struct UploadFileParams {
    /// ID of pet to update
    pub pet_id: i64,
    /// Additional data to pass to server
    pub additional_metadata: Option<String>,
    /// file to upload
    pub file: Option<std::path::PathBuf>
}


/// struct for typed successes of method [`add_pet`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AddPetSuccess {
    Status200(models::Pet),
    UnknownValue(serde_json::Value),
}

/// struct for typed successes of method [`delete_pet`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DeletePetSuccess {
    UnknownValue(serde_json::Value),
}

/// struct for typed successes of method [`find_pets_by_status`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum FindPetsByStatusSuccess {
    Status200(Vec<models::Pet>),
    UnknownValue(serde_json::Value),
}

/// struct for typed successes of method [`find_pets_by_tags`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum FindPetsByTagsSuccess {
    Status200(Vec<models::Pet>),
    UnknownValue(serde_json::Value),
}

/// struct for typed successes of method [`get_pet_by_id`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetPetByIdSuccess {
    Status200(models::Pet),
    UnknownValue(serde_json::Value),
}

/// struct for typed successes of method [`update_pet`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UpdatePetSuccess {
    Status200(models::Pet),
    UnknownValue(serde_json::Value),
}

/// struct for typed successes of method [`update_pet_with_form`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UpdatePetWithFormSuccess {
    UnknownValue(serde_json::Value),
}

/// struct for typed successes of method [`upload_file`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UploadFileSuccess {
    Status200(models::ApiResponse),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`add_pet`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AddPetError {
    Status405(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`delete_pet`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DeletePetError {
    Status400(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`find_pets_by_status`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum FindPetsByStatusError {
    Status400(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`find_pets_by_tags`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum FindPetsByTagsError {
    Status400(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`get_pet_by_id`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetPetByIdError {
    Status400(),
    Status404(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`update_pet`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UpdatePetError {
    Status400(),
    Status404(),
    Status405(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`update_pet_with_form`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UpdatePetWithFormError {
    Status405(),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`upload_file`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UploadFileError {
    UnknownValue(serde_json::Value),
}


/// 
pub async fn add_pet(configuration: &configuration::Configuration, params: AddPetParams) -> Result<ResponseContent<AddPetSuccess>, Error<AddPetError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let pet = params.pet;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/pet", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&pet);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        let local_var_entity: Option<AddPetSuccess> = serde_json::from_str(&local_var_content).ok();
        let local_var_result = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Ok(local_var_result)
    } else {
        let local_var_entity: Option<AddPetError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// 
pub async fn delete_pet(configuration: &configuration::Configuration, params: DeletePetParams) -> Result<ResponseContent<DeletePetSuccess>, Error<DeletePetError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let pet_id = params.pet_id;
    let api_key = params.api_key;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/pet/{petId}", local_var_configuration.base_path, petId=pet_id);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::DELETE, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(local_var_param_value) = api_key {
        local_var_req_builder = local_var_req_builder.header("api_key", local_var_param_value.to_string());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        let local_var_entity: Option<DeletePetSuccess> = serde_json::from_str(&local_var_content).ok();
        let local_var_result = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Ok(local_var_result)
    } else {
        let local_var_entity: Option<DeletePetError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Multiple status values can be provided with comma separated strings
pub async fn find_pets_by_status(configuration: &configuration::Configuration, params: FindPetsByStatusParams) -> Result<ResponseContent<FindPetsByStatusSuccess>, Error<FindPetsByStatusError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let status = params.status;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/pet/findByStatus", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = match "csv" {
        "multi" => local_var_req_builder.query(&status.into_iter().map(|p| ("status".to_owned(), p.to_string())).collect::<Vec<(std::string::String, std::string::String)>>()),
        _ => local_var_req_builder.query(&[("status", &status.into_iter().map(|p| p.to_string()).collect::<Vec<String>>().join(",").to_string())]),
    };
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        let local_var_entity: Option<FindPetsByStatusSuccess> = serde_json::from_str(&local_var_content).ok();
        let local_var_result = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Ok(local_var_result)
    } else {
        let local_var_entity: Option<FindPetsByStatusError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
pub async fn find_pets_by_tags(configuration: &configuration::Configuration, params: FindPetsByTagsParams) -> Result<ResponseContent<FindPetsByTagsSuccess>, Error<FindPetsByTagsError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let tags = params.tags;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/pet/findByTags", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = match "csv" {
        "multi" => local_var_req_builder.query(&tags.into_iter().map(|p| ("tags".to_owned(), p.to_string())).collect::<Vec<(std::string::String, std::string::String)>>()),
        _ => local_var_req_builder.query(&[("tags", &tags.into_iter().map(|p| p.to_string()).collect::<Vec<String>>().join(",").to_string())]),
    };
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        let local_var_entity: Option<FindPetsByTagsSuccess> = serde_json::from_str(&local_var_content).ok();
        let local_var_result = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Ok(local_var_result)
    } else {
        let local_var_entity: Option<FindPetsByTagsError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Returns a single pet
pub async fn get_pet_by_id(configuration: &configuration::Configuration, params: GetPetByIdParams) -> Result<ResponseContent<GetPetByIdSuccess>, Error<GetPetByIdError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let pet_id = params.pet_id;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/pet/{petId}", local_var_configuration.base_path, petId=pet_id);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("api_key", local_var_value);
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        let local_var_entity: Option<GetPetByIdSuccess> = serde_json::from_str(&local_var_content).ok();
        let local_var_result = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Ok(local_var_result)
    } else {
        let local_var_entity: Option<GetPetByIdError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// 
pub async fn update_pet(configuration: &configuration::Configuration, params: UpdatePetParams) -> Result<ResponseContent<UpdatePetSuccess>, Error<UpdatePetError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let pet = params.pet;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/pet", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::PUT, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&pet);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        let local_var_entity: Option<UpdatePetSuccess> = serde_json::from_str(&local_var_content).ok();
        let local_var_result = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Ok(local_var_result)
    } else {
        let local_var_entity: Option<UpdatePetError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// 
pub async fn update_pet_with_form(configuration: &configuration::Configuration, params: UpdatePetWithFormParams) -> Result<ResponseContent<UpdatePetWithFormSuccess>, Error<UpdatePetWithFormError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let pet_id = params.pet_id;
    let name = params.name;
    let status = params.status;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/pet/{petId}", local_var_configuration.base_path, petId=pet_id);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    if let Some(local_var_param_value) = name {
        local_var_form_params.insert("name", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = status {
        local_var_form_params.insert("status", local_var_param_value.to_string());
    }
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        let local_var_entity: Option<UpdatePetWithFormSuccess> = serde_json::from_str(&local_var_content).ok();
        let local_var_result = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Ok(local_var_result)
    } else {
        let local_var_entity: Option<UpdatePetWithFormError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// 
pub async fn upload_file(configuration: &configuration::Configuration, params: UploadFileParams) -> Result<ResponseContent<UploadFileSuccess>, Error<UploadFileError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let pet_id = params.pet_id;
    let additional_metadata = params.additional_metadata;
    let file = params.file;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/pet/{petId}/uploadImage", local_var_configuration.base_path, petId=pet_id);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form = reqwest::multipart::Form::new();
    if let Some(local_var_param_value) = additional_metadata {
        local_var_form = local_var_form.text("additionalMetadata", local_var_param_value.to_string());
    }
    // TODO: support file upload for 'file' parameter
    local_var_req_builder = local_var_req_builder.multipart(local_var_form);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        let local_var_entity: Option<UploadFileSuccess> = serde_json::from_str(&local_var_content).ok();
        let local_var_result = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Ok(local_var_result)
    } else {
        let local_var_entity: Option<UploadFileError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

