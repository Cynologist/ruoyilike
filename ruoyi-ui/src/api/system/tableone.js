import request from '@/utils/request'

// 查询自建一列表
export function listTableone(query) {
  return request({
    url: '/system/tableone/list',
    method: 'get',
    params: query
  })
}

// 查询自建一详细
export function getTableone(id) {
  return request({
    url: '/system/tableone/' + id,
    method: 'get'
  })
}

// 新增自建一
export function addTableone(data) {
  return request({
    url: '/system/tableone',
    method: 'post',
    data: data
  })
}

// 修改自建一
export function updateTableone(data) {
  return request({
    url: '/system/tableone',
    method: 'put',
    data: data
  })
}

// 删除自建一
export function delTableone(id) {
  return request({
    url: '/system/tableone/' + id,
    method: 'delete'
  })
}
