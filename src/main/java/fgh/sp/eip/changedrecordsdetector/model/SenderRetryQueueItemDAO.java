package fgh.sp.eip.changedrecordsdetector.model;

public class SenderRetryQueueItemDAO {
	
//public class SenderRetryQueueItemDAO extends BaseDAO{
	
	/*public static void insert(SenderRetryQueueItem record, Connection conn) throws DBException{
		try {
			Object[] params = {record.getEvent().getTableName(),
							   record.getEvent().getPrimaryKeyId(),
							   record.getEvent().getIdentifier(),
							   record.getEvent().getOperation(),
							   record.getDestination(),
							   record.getAttemptCount(),
							   record.getEvent().getSnapshot(),
							   record.getMessage(),
							   record.getDateCreated(),
							   record.getDateChanged(),
							   "java.lang.Exception"
							 };
			
			String sql = "";
			
			sql += "INSERT INTO sender_retry_queue(	TABLE_NAME,\n";
			sql += "									PRIMARY_KEY_ID,\n";
			sql += "									IDENTIFIER,\n";
			sql += "									OPERATION,\n";
			sql += "									DESTINATION,\n";
			sql += "									ATTEMPT_COUNT,\n";
			sql += "									SNAPSHOT,\n";
			sql += "									MESSAGE,\n";
			sql += "									DATE_CREATED,\n";
			sql += "									DATE_CHANGED,\n";
			sql += "									EXCEPTION_TYPE)\n";
			sql += "	VALUES(?,\n";
			sql += "		   ?,\n";
			sql += "		   ?,\n";
			sql += "		   ?,\n";
			sql += "		   ?,\n";
			sql += "		   ?,\n";
			sql += "		   ?,\n";
			sql += "		   ?,\n";
			sql += "		   ?,\n";
			sql += "		   ?,\n";
			sql += "		   ?);";
			
			executeQuery(sql, params, conn);
		} catch (DBException e) {
			if (!e.isDuplicatePrimaryKeyException()) {
				throw e;
			}
		}
	}*/
}
