package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QPessoa is a Querydsl query type for Pessoa
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QPessoa extends EntityPathBase<Pessoa> {

    private static final long serialVersionUID = 1280741181L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPessoa pessoa = new QPessoa("pessoa");

    public final StringPath cpfCnpj = createString("cpfCnpj");

    public final DateTimePath<java.util.Date> dataAtualizacao = createDateTime("dataAtualizacao", java.util.Date.class);

    public final DateTimePath<java.util.Date> dataCriacao = createDateTime("dataCriacao", java.util.Date.class);

    public final QEndereco endereco;

    public final CollectionPath<EnderecoEletronico, QEnderecoEletronico> enderecosEletronicos = this.<EnderecoEletronico, QEnderecoEletronico>createCollection("enderecosEletronicos", EnderecoEletronico.class, QEnderecoEletronico.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nome = createString("nome");

    public final CollectionPath<Telefone, QTelefone> telefones = this.<Telefone, QTelefone>createCollection("telefones", Telefone.class, QTelefone.class, PathInits.DIRECT2);

    public final EnumPath<br.ufms.estagio.enumerate.TipoPessoa> tipoPessoa = createEnum("tipoPessoa", br.ufms.estagio.enumerate.TipoPessoa.class);

    public QPessoa(String variable) {
        this(Pessoa.class, forVariable(variable), INITS);
    }

    public QPessoa(Path<? extends Pessoa> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPessoa(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QPessoa(PathMetadata<?> metadata, PathInits inits) {
        this(Pessoa.class, metadata, inits);
    }

    public QPessoa(Class<? extends Pessoa> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.endereco = inits.isInitialized("endereco") ? new QEndereco(forProperty("endereco"), inits.get("endereco")) : null;
    }

}

