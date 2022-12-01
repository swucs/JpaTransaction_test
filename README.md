## TransactionTestService

#### @Transactional(propagation = Propagation.NOT_SUPPORTED) 일때
 TransactionTestSubService에서 Parent 변경시 update되지 않음.
트랜잭션 없는 NOT_SUPPORTED에서 조회된 Parent가 새로 생성된 Transaction에서는 변경이 되지 않은 것으로 유추?
해결하기 위해서는 TransactionTestSubService에서 Parent를 다시 조회(findById)해야 한다.


#### @Transactional(propagation = Propagation.REQUIRED) 일때
TransactionTestSubService에서 Parent 변경시 update됨
