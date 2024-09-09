import httpClient from "../http-common";

const getAll = () => {
    return httpClient.get('/reparaciones/');
}

const create = data => {
    return httpClient.post('/reparaciones/', data);
}

const get = id => {
    return httpClient.get(`/reparaciones/${id}`);
}

const update = data => {
    return httpClient.put('/reparaciones/', data);
}

const remove = id => {
    return httpClient.delete(`/reparaciones/${id}`);
}

export default { getAll, create, get, update, remove };