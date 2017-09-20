package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUsuario is a Querydsl query type for Usuario
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUsuario extends EntityPathBase<Usuario> {

    private static final long serialVersionUID = 1592944216L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUsuario usuario = new QUsuario("usuario");

    public final QPessoaFisica _super;

    public final BooleanPath ativo = createBoolean("ativo");

    //inherited
    public final StringPath cpfCnpj;

    //inherited
    public final DateTimePath<java.util.Date> dataAtualizacao;

    //inherited
    public final DateTimePath<java.util.Date> dataCriacao;

    // inherited
    public final QEndereco endereco;

    //inherited
    public final CollectionPath<EnderecoEletronico, QEnderecoEletronico> enderecosEletronicos;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath nacionalidade;

    //inherited
    public final StringPath nome;

    //inherited
    public final NumberPath<Integer> rgNumero;

    //inherited
    public final StringPath rgOrgaoExpedidor;

    public final StringPath senha = createString("senha");

    //inherited
    public final CollectionPath<Telefone, QTelefone> telefones;

    //inherited
    public final EnumPath<br.ufms.estagio.enumerate.TipoPessoa> tipoPessoa;

    public final EnumPath<br.ufms.estagio.enumerate.TipoUsuario> tipoUsuario = createEnum("tipoUsuario", br.ufms.estagio.enumerate.TipoUsuario.class);

    public QUsuario(String variable) {
        this(Usuario.class, forVariable(variable), INITS);
    }

    public QUsuario(Path<? extends Usuario> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUsuario(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUsuario(PathMetadata<?> metadata, PathInits inits) {
        this(Usuario.class, metadata, inits);
    }

    public QUsuario(Class<? extends Usuario> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QPessoaFisica(type, metadata, inits);
        this.cpfCnpj = _super.cpfCnpj;
        this.dataAtualizacao = _super.dataAtualizacao;
        this.dataCriacao = _super.dataCriacao;
        this.endereco = _super.endereco;
        this.enderecosEletronicos = _super.enderecosEletronicos;
        this.id = _super.id;
        this.nacionalidade = _super.nacionalidade;
        this.nome = _super.nome;
        this.rgNumero = _super.rgNumero;
        this.rgOrgaoExpedidor = _super.rgOrgaoExpedidor;
        this.telefones = _super.telefones;
        this.tipoPessoa = _super.tipoPessoa;
    }

}

