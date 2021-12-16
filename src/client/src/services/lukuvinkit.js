import axios from 'axios'
const baseUrl = 'http://localhost:8080/readingTip/'

const getAll = () => {
    const request = axios.get(baseUrl+'getAll')
    return request.then(response => response.data)
}

const create = newObject => {
    const request = axios.post(baseUrl+'add', newObject)
    return request.then(response => response.data)
}

const update = (id, newObject) => {
    const request = axios.put(`${baseUrl}/${id}`, newObject)
    return request.then(response => response.data)
}

export default { getAll, create, update }