package jef;

import java.io.File;
import java.util.Set;

import jef.database.DataObject;
import jef.database.DbClient;
import jef.database.support.QuerableEntityScanner;
import jef.tools.InitDataExporter;

import org.junit.Ignore;

import com.github.geequery.orm.annotation.InitializeData;

@Ignore
public class DbExporter {

	/**
	 * 将数据库中的数据全部作为初始化数据导出到src/main/resources下。
	 * 
	 * @throws Exception
	 */
	public void doxport(DbClient client,String packageName, File output) throws Exception {
//		QuerableEntityScanner cs = new QuerableEntityScanner();
//		cs.setPackageNames(packageName);
//		cs.doScan();
//		Set<String> entities = cs.scan();
//		InitDataExporter exporter = new InitDataExporter(client, output);
//		for (String clz : entities) {
//			Class<?> e = Class.forName(clz);
//			if (DataObject.class.isAssignableFrom(e)) {
//				InitializeData data = e.getAnnotation(InitializeData.class);
//				if (data != null)
//					exporter.export(e);
//			}
//		}
	}
}
